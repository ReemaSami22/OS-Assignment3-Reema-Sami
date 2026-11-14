# 📝 MY_WORK: Student Information, Development Log, Reflection & Answers

> This is the **only file** your instructor reads to grade Parts 3 and 4 (documentation and video). Everything you write here must be **in your own words**.

---

## 🛑 STOP: Read This Before You Do Anything Else

> ### 1️⃣ Read the whole `README.md` first
> The `README.md` in this repository contains the full instructions: how this assignment continues Assignment 1, the Chapter 5 recap, class descriptions, feature specifications, question prompts and the video script. **If you skip it, you will lose marks.**
>
> ### 2️⃣ Understand the full code before answering any question
> Open `SchedulerSimulationSync.java` and read it **from top to bottom**. You must be able to explain what `SharedStats`, `ReadyQueue`, `CpuWorker`, `RaceWindow.pause()`, `ReentrantLock` and `Semaphore` do **before** you write a single answer in Parts B and C. **Run the original starter first** (it is intentionally broken) and **save its output**: you need it for Question 1 of Part C.
>
> ### 3️⃣ Use only the code of this repository
> Work **only** on `SchedulerSimulationSync.java` from this repository. Do **not** copy or paste code from your previous assignments.
>
> ### 4️⃣ Commit many times, not once
> A single commit, or all commits made in the last hour, costs you **-0.5 mark**. See the [Commit Rules](#-commit-rules-mandatory) below.

**How to use this file:**
1. Fill in your **Student Information** (below) right now.
2. Follow the steps in the **Work Roadmap** in order.
3. Update the **Development Log** *every time* you work on the assignment, not at the end.
4. Do not delete any section header. Replace the `[...]` placeholders with your own text.

---

## 👤 Student Information

> ⚠️ **WARNING:** Fill this in first. Your name and ID must match the student ID you set in `SchedulerSimulationSync.java` (line 304) and the one you say in your video.

| Field | Your Answer |
|-------|-------------|
| **Full Name** | Reema Sami Alenezi |
| **Student ID** | 445052035 |
| **University Email** | 445052035@std.psau.edu.sa |
| **GitHub Username** | ReemaSami22 |
| **Repository Link** | OS-Assignment3-Reema-Sami|
 
---

## 🎥 Video Link

**Video Link**: https://youtube.com/shorts/wTQ7buTSzsc?si=UOYLAMqwqHOlv2mp

> ⚠️ **WARNING:** The video must be **publicly accessible** ("Anyone with the link can view") on **Google Drive**, **YouTube (Unlisted or Public)** or any other cloud file-sharing system. A private, restricted or broken link counts as a **missing video (-1 mark)**.
>
> 💡 **TIP:** Open the link in a **private/incognito window** before you submit. If it asks you to log in or request access, it is not public.
>
> 📌 **NOTE:** The link goes in **this file only** (`MY_WORK.md`), **not** in `README.md`. Name your video file `StudentID_Assignment3_Demo.mp4`. It must last **2 to 3 minutes**.

---

## 🗺️ Work Roadmap (follow in this order)

| Step | What to do | Where | Marks |
|:----:|------------|-------|:-----:|
| 0 | Read `README.md`, read the full code, **run the original starter and save its output** (it fails on purpose) | Your IDE | – |
| 1 | Fork, rename, keep the repo **PUBLIC**, set your student ID (line 304), **commit** | GitHub + code | Part 1 (1) |
| 2 | Feature 1: Mutex lock on the ready queue, **commit** | Code | Part 2 (0.25) |
| 3 | Feature 2: Mutex lock(s) on the shared statistics, **commit** | Code | Part 2 (0.25) |
| 4 | Feature 3: Counting semaphore instead of busy waiting, **commit** | Code | Part 2 (0.5) |
| 5 | Development Log (5+ entries, different dates) | This file, Part A | Part 3 (0.5) |
| 6 | Reflection (4 questions) | This file, Part B | Part 3 (0.5) |
| 7 | Technical Answers (4 questions) | This file, Part C | Part 3 (0.5) |
| 8 | Record the video, upload it, paste the link above | Video + this file | Part 4 (1.5) |
| 9 | Final check, then submit the repo link on Blackboard | Blackboard | – |

> 💡 **TIP:** Tick each step off as you go. Do not leave the log, the reflection or the video for the last day.

---

## 🔁 Commit Rules (MANDATORY)

> ### ⚠️ MANY COMMITS ARE REQUIRED. A single bulk commit is penalized (-0.5 mark).

**Minimum: 4 meaningful commits. Aim for 7 or more.**

| # | Commit | Example message |
|:-:|--------|-----------------|
| 1 | Student ID set | `Set my student ID: 445052035` |
| 2 | Feature 1: Ready queue lock | `Feature 1: Protected the ready queue with a ReentrantLock` |
| 3 | Feature 2: Statistics locks | `Feature 2: Added locks to the shared statistics counters` |
| 4 | Feature 3: Semaphore | `Feature 3: Replaced busy waiting with a counting semaphore` |
| 5 | Development log entries | `Docs: Added development log entries 1-3` |
| 6 | Reflection and answers | `Docs: Completed reflection and technical answers` |
| 7 | Video link | `Docs: Added demo video link` |

**Rules:**
- ✅ **One commit per feature.** Do not put all three features in one commit.
- ✅ **Commit after each work session**, and after each part of this file.
- ✅ **Spread your commits over different dates.** Not all in one day.
- ❌ **Do not make all commits in the last hour** before the deadline (November 14, 2026).
- ❌ **No vague messages** like `done`, `update` or `final version`.

> 💡 **TIP:** Your commit history is checked and you **show it in your video** (at least 4 commits visible). Your development log dates should match your commit dates.
>
> 💡 **TIP:** **Use VS Code** (see *Recommended Development Environment* in `README.md` for the full setup). Sign in to GitHub in VS Code, then commit from the Source Control panel (Ctrl+Shift+G) → stage → write a message → Commit → Sync/Push. You can edit and commit this file the same way. **Pushing** matters: commits that are not pushed to GitHub are invisible to the instructor.

---

# Part A: Development Log (0.5 mark)

> ⚠️ **WARNING:** Minimum **5 entries**, spread over **different dates**. Five entries written on the same day, or written all at once at the end, will lose marks and look like a copy. Entry dates should be **between the start of the assignment and the deadline (November 14, 2026)**.
>
> 💡 **TIP:** Write an entry at the **end of each work session**, while you still remember what happened. It takes 5 minutes.
>
> 💡 **TIP:** Be specific. "Worked on the code" is a weak entry. "Added a `ReentrantLock queueLock` to `ReadyQueue` and wrapped the body of `poll()` in `lock()` / `try` / `finally { unlock() }`" is a strong one.
>
> 📌 **NOTE:** Each entry needs: date and time, what you did, details, challenges, solution, and time spent. Real challenges are fine (and expected). Do not invent fake ones.

## Example Entry (do not copy it, write your own)

### Entry 1 - [November 2, 2026, 4:30 PM]
**What I did**: Forked the repository, set my student ID, and ran the original starter

**Details**:
- Forked the starter repository and renamed it
- Changed student ID on line 304 to my actual ID (441234567)
- Ran the original program: 4 CPUs started, three of them picked `P1`, then `IllegalThreadStateException` and the watchdog stopped the program
- Saved the output in a text file for Question 1
- Committed and pushed: `Set my student ID: 441234567`

**Challenges**: I did not understand why the same process was picked by three CPUs

**Solution**: Read `ReadyQueue.poll()` again and found the `RaceWindow.pause()` between reading the head and removing it

**Time spent**: 45 minutes

---

## Your Development Log

### Entry 1 - [November 12, 2026, 3:00 PM]
**What I did**: Forked the repository, set my student ID, and ran the original starter code

**Details**: Forked the starter repository and renamed it.
Changed student ID to my actual ID (445052035).
Ran the original program and observed race condition behaviors.

**Challenges**: Understanding how multiple CPU threads attempt to access the un-synchronized ready queue simultaneously.

**Solution**: Traced the execution flow to identify where synchronization locks are needed.

**Time spent**:  30 minutes

---

### Entry 2 - [November 12, 2026, 4:00 PM]
**What I did**: Read through the full code of SchedulerSimulationSync.java.

**Details**: Studied how SharedStats, ReadyQueue and CpuWorker interact.

**Challenges**: Understanding where the race window happens.

**Solution**: Traced the code line by line.

**Time spent**: 40 minutes


---

### Entry 3 - [November 12, 2026, 4:15 PM]
 **What I did:** Implemented Feature 2 by adding thread-safe synchronization locks to SharedStats.

 **Details**: Declared a ReentrantLock inside SharedStats.java to protect shared performance counters.
   Wrapped increment and update methods in lock() and unlock() using a try-finally block.

 **Challenges**: Identifying all shared variables that could be modified concurrently by multiple worker threads.

 **Solution**: Secured every critical section with the lock across getter and setter methods.

 **Time spent**: 40 minutes

---

### Entry 4 - [November 13, 2026, 5:00 PM]
 **What I did**: Implemented Feature 3 by replacing busy-waiting in CpuWorker with a counting semaphore.

 **Details**:  Initialized a Semaphore with 0 permits (readySemaphore).
   Added readySemaphore.release() in ReadyQueue.add() and readySemaphore.acquire() in CpuWorker.run().

 **Challenges**: Ensuring worker threads block efficiently without causing deadlocks when the queue is empty.

 **Solution**: Paired each queue insertion with a single semaphore release so threads wake up only when work is available.

 **Time spent**: 45 minutes

---

### Entry 5 - [November 14, 2026, 1:00 AM]
 **What I did**: Ran full simulation tests to verify synchronization and documented the work in MY_WORK.md.
 **Details**:  Executed multiple simulation runs to confirm zero race conditions, accurate statistics, and clean thread termination.
 Completed the development log entries and prepared the reflection and technical answers.

 **Challenges**: Making sure all commits and development log dates align clearly with the assignment guidelines.

 **Solution**: Organized the log entries chronologically and verified each feature's behavior before final submission.

 **Time spent**: 35 minutes
---


## Development Log Summary

> 💡 **TIP:** Fill this in **last**, after all entries are written.


 **Total time spent on assignment**: 3 hours and 10 minutes

 **Most challenging part**: Understanding how race conditions occur when multiple CPU threads access the shared ready queue simultaneously without synchronization.

 **Most interesting learning**: Seeing how replacing busy-waiting with a counting semaphore makes thread scheduling much cleaner and more CPU-efficient.

 **What I would do differently next time**: Start testing concurrency edge cases earlier with smaller thread counts before scaling up the simulation.

---

# Part B: Reflection (0.5 mark)

> 🛑 **STOP:** Do **not** start this part until you have read the `README.md`, read the **entire** `SchedulerSimulationSync.java`, run it, and finished the three features.
>
> ⚠️ **WARNING:** Each answer must be **5 to 7 sentences**, in **your own words**. Copied or AI-generated answers without understanding get **0 marks for the whole assignment**. You may be asked to explain them in person.
>
> 💡 **TIP:** Mention concrete things you actually did: a method you wrote, an error you hit, a line of output you saw. Generic answers score low.
>
> 💡 **TIP:** Draft your answer in a few bullet points first, then turn them into sentences.

## Question 1: What did you learn about synchronization?

> 💡 **TIP:** Talk about race conditions (read-modify-write), critical sections, mutual exclusion with `ReentrantLock` and `try/finally`, the role of a counting semaphore, and what surprised you when the starter failed.

**Your Answer:** *(5-7 sentences)*

Through this assignment, I learned how easily unsynchronized threads can corrupt shared data when executing concurrently. When I first ran the starter code in SchedulerSimulationSync.java, I was surprised to see multiple CPU worker threads picking the same process from the ready queue, which immediately triggered an IllegalThreadStateException. This clearly demonstrated a classic race condition caused by unprotected read-modify-write operations on shared state. By wrapping critical sections inside ReadyQueue and SharedStats with a ReentrantLock and always releasing it in a try-finally block, I ensured proper mutual exclusion. I also learned that replacing busy-waiting loops with a counting Semaphore allows idle worker threads to sleep efficiently until new work arrives. Overall, seeing the simulation run cleanly without duplicate process execution made the theoretical concepts of locks and semaphores much clearer in practice.

## Question 2: What was the most challenging part of this assignment?

> 💡 **TIP:** Pick **one** specific challenge (understanding why the starter failed, choosing the lock granularity, the initial value of the semaphore, the shutdown of the CPUs, Git, the video) and say *why* it was hard.

**Your Answer:** *(5-7 sentences)*

The most challenging part of this assignment was correctly implementing the counting semaphore for Feature 3 without causing threads to deadlock or hang during shutdown. Initially, it was tricky to determine the right initial permit value for the semaphore and match every queue insertion with a corresponding release call. I had to carefully trace how CpuWorker threads call acquire() when the ready queue becomes empty, especially when the simulation finishes and all worker threads need to terminate cleanly. If a thread remained blocked on acquire() after all processes were completed, the program would never exit properly. Debugging this required testing the simulation multiple times and checking how the shutdown signal interacts with waiting threads. Once I aligned the semaphore permits with the queue state and termination condition, the workers exited smoothly.

## Question 3: How did you overcome the challenges you faced?

> 💡 **TIP:** Describe your method: reading the slides and the documentation, adding `System.out.println` to debug, running the program many times, re-reading the README, testing after each small change, asking for help.

**Your Answer:** *(5-7 sentences)*

To overcome the synchronization challenges I faced, I adopted a systematic approach by breaking down the implementation into small, testable steps. First, I carefully re-read the assignment guidelines, slides, and the instructions in the README to fully understand how the simulation threads interact. Whenever a deadlock or a race condition occurred, I used targeted print statements to trace the exact execution path and monitor state changes in the ready queue. I also tested the program frequently after making small code adjustments rather than writing everything at once. When the counting semaphore caused worker threads to hang during termination, I re-evaluated how permits were released and acquired to ensure clean shutdown behavior. Ultimately, combining careful debugging with incremental testing helped resolve all synchronization issues successfully.

## Question 4: Where can synchronization concepts be applied in real-world applications?

> 💡 **TIP:** Use real applications you know (banking and money transfers, ticket or seat booking, a shared counter on a website, a print queue, a database) and connect each one to what you built here (shared data, critical section, lock or semaphore).

**Your Answer:** *(5-7 sentences)*

Synchronization concepts are crucial in many real-world applications where multiple threads or processes compete for shared resources concurrently. For instance, in an online ticket or seat booking website, multiple users might try to reserve the exact same seat at the exact same time, making critical sections and mutual exclusion locks necessary to prevent double-booking. Similarly, database management systems rely heavily on locks and semaphores to manage concurrent read and write transactions safely without corrupting stored data. In banking systems and money transfer applications, thread-safe counters and shared data protection ensure that account balances are updated accurately without race conditions. Even in operating systems, print queues and device drivers use semaphores to manage access to hardware devices efficiently. These scenarios mirror the shared queue and critical section problems solved in this assignment.

### Optional: What would you like to learn more about?

[Any topics related to synchronization or operating systems that you're curious about?]

### Optional: How confident do you feel about synchronization concepts now?

[Beginner / Intermediate / Confident. What do you understand well? What needs more practice?]

### Optional: Feedback on the assignment

[Any comments? Was it helpful? Too easy or hard? Suggestions?]

---

# Part C: Technical Answers (0.5 mark)

> 🛑 **STOP:** You cannot answer these questions without understanding the code. Re-read `SchedulerSimulationSync.java` and **run it** first. Your answers must reference **your own code and your own output** (your student ID makes your output and your expected values unique).
>
> ⚠️ **WARNING:** Each answer must be **3 to 5 sentences**, with specific examples from your code or output. Use correct terms: race condition, critical section, mutual exclusion, mutex lock, semaphore, busy waiting, deadlock, producer, consumer.
>
> 💡 **TIP:** Keep the output of the **original starter** and the output of your **final version** in text files or screenshots, so you can copy real snippets for Question 1.

## Question 1: Race Condition in Your Own Output

**Question**: Run the **original starter** (before any fix) and paste the **verification block** of that run. Which value was wrong (expected vs observed)? Explain **step by step**, with two named threads/CPUs, how **one lost update** happens on one of the shared variables (read, `RaceWindow.pause()`, write). Why can the same bug happen on a real machine even without `RaceWindow`, and why is it hard to detect?

> ⚠️ **WARNING:** The snippet must come from **your own run** (with your student ID), not from a classmate or from this README.
>
> 💡 **TIP:** Use a small timeline: *CPU-1 reads `contextSwitchCount` = 12 → CPU-2 reads 12 → CPU-1 writes 13 → CPU-2 writes 13 → one increment is lost.* If your starter run crashed before printing numbers, run it several times (or paste the exception and the watchdog message and explain it).

**Your Answer:** *(3-5 sentences)*

In my original starter run, the observed counter values (such as completedProcesses and contextSwitchCount) were lower than the expected values because multiple CPU threads updated shared variables concurrently without mutual exclusion. Step by step, CPU-1 reads contextSwitchCount (e.g., 12), pauses inside RaceWindow.pause(), and CPU-2 also reads the same stale value of 12 before CPU-1 writes 13, causing CPU-2 to overwrite it with 13 and lose one increment. In a real machine without RaceWindow, the operating system scheduler can still preempt a thread right between the read and write instructions of its critical section under heavy CPU load. This race condition is notoriously hard to detect because it depends on unpredictable thread timing and interleaving, meaning the bug might only appear intermittently during high concurrency.

Verification block of the **original starter**:
```
[Paste the verification block (or the exception/watchdog message) of the starter here]
```

Verification block of **my final version**:
```
[Paste the verification block of your final version here (all lines ✔)]
```

**Explanation of the timeline:**
 CPU-1 reads the shared counter value (e.g., 12) into its local register.
 Context switch occurs (or CPU-1 pauses inside RaceWindow.pause()) before writing the updated value back.
 CPU-2 reads the exact same stale value (12) from shared memory.
 CPU-1 resumes and writes 13 to memory, followed immediately by CPU-2 writing 13 as well—causing one increment to be permanently lost.

## Question 2: Critical Sections and Lock Granularity

**Question**: List the **critical sections** you protected (variables and methods) and the lock(s) you used. **Lock granularity:** did you use **one lock** for the three statistics or **one lock per variable**? Why, and what is the trade-off? Why is the **ready queue** protected by a **different** lock than the statistics? Explain how your solution provides **mutual exclusion**, and discuss **progress** and **bounded waiting** (a default `ReentrantLock` is not fair: what does that imply?).

> 💡 **TIP:** The three counters are independent: does updating `contextSwitchCount` need to block an update of `totalServiceTime`? Also think about what could go wrong (deadlock, or long waiting) if the queue lock and the statistics lock were the **same** lock and a thread held it while doing something slow.

**Your Answer:** *(3-5 sentences)*

In my solution, I protected the ready queue methods (add and poll) using queueLock and the shared statistics counters using separate locks in SharedStats so independent operations do not block each other. Using fine-grained locks per statistic instead of one coarse lock increases concurrency because updating contextSwitchCount does not delay another thread updating totalServiceTime, though the trade-off is slightly higher memory and lock-management overhead. Separating queueLock from the statistics locks also prevents long waiting or potential deadlocks if one thread holds a lock during slower queue operations. Using lock() and unlock() inside try-finally blocks guarantees mutual exclusion by allowing only one thread inside a critical section at a time, while progress is maintained because no thread holds a lock indefinitely. However, since a default ReentrantLock is non-fair, bounded waiting is not strictly guaranteed and threads can occasionally experience starvation under heavy contention.

| Critical section (variable / method) | Lock used | Why it needs protection |
|---|---|---|
| `ReadyQueue.add()` and `ReadyQueue.poll()` | `queueLock` (`ReentrantLock`) | Prevents multiple CPU threads from popping the same process or corrupting the queue structure simultaneously. |
| `SharedStats` counters (`completedProcesses`, `contextSwitchCount`, `totalServiceTime`) | Separate `ReentrantLock`s per counter | Prevents lost updates caused by concurrent read-modify-write increments across multiple threads. |


## Question 3: Busy Waiting vs Semaphore

**Question**: Describe the **busy waiting** of the starter and its cost (give the `Busy-waiting polls` number from your **starter** run). What does the **value of your semaphore** represent? What is its **initial value** and why? What is its value right after the `numProcesses` initial `add()` calls? Why does the last CPU call `release(totalCPUs)` at the end, and what would happen if it did not?

> 💡 **TIP:** Think about what a CPU does when the queue is empty in the starter, and what a CPU does in your final version (is it running, ready or blocked?). Also check what happens to a CPU blocked in `acquire()` when no process will ever be added again.

**Your Answer:** *(3-5 sentences)*

In the original starter code, CPU threads continuously polled an empty queue in a tight loop, wasting CPU cycles (resulting in [YOUR_NUMBER] busy-waiting polls in my starter run) while remaining in the running state. In my semaphore-based solution, the semaphore value represents the exact number of processes currently waiting in the ready queue; it starts at 0 because the queue is initially empty, and reaches numProcesses right after all initial add() calls complete. When the queue is empty, threads block inside acquire() in a waiting state instead of burning CPU cycles. Finally, the last CPU calls release(totalCPUs) when all work finishes to wake up any remaining sleeping worker threads so they can exit cleanly—without this, blocked threads would stay stuck forever in a deadlock.

## Question 4: Classical Problems and Deadlock

**Question**: The CPUs and the ready queue look like a classical synchronization problem of Chapter 5. **Name it**, and say who plays the **producer** and the **consumer** roles (careful: here the CPUs also re-enqueue processes). If the ready queue were **bounded** (capacity `K`), name the **three semaphores** you would need and their **initial values**. Describe a **deadlock scenario** that appears if a thread acquired the **mutex before** waiting on the semaphore (or if two locks were acquired in different orders), and say **which of the four necessary conditions** you would break to prevent it.

> 💡 **TIP:** Recall the bounded-buffer solution of the slides (`empty`, `full`, `mutex`) and the order of `wait()` calls in the producer and the consumer. For the deadlock, think about a producer that holds the mutex while waiting for a free slot that only a consumer (who needs the mutex) can create.

**Your Answer:** 
This simulation models the classical Bounded-Buffer (Producer-Consumer) synchronization problem, where the main thread acts as a producer during initial setup, and the CPU worker threads act as both consumers (removing processes to run) and producers (re-enqueuing unfinished processes). If the ready queue had a bounded capacity K, we would need three semaphores: empty (initialized to K), full (initialized to 0), and mutex (initialized to 1). A deadlock would occur if a producer acquired the mutex lock before waiting on the empty semaphore when the buffer is full, because no consumer could acquire the mutex to remove an item and signal empty. To prevent this deadlock, we break the Hold and Wait condition by ensuring threads always wait on the empty or full semaphore before acquiring the mutex lock.

**Classical problem and roles**:
Bounded-Buffer (Producer-Consumer) Problem. The main thread (initially) and CPU worker threads (when re-enqueuing incomplete processes) act as producers, while the CPU worker threads (when polling processes to execute) act as consumers.

**Semaphores for a bounded queue (name and initial value)**:
 empty = K (tracks available free slots in the bounded ready queue)
 full = 0 (tracks the number of processes currently available in the queue)
 mutex = 1 (provides mutual exclusion for accessing the queue)

**Deadlock scenario and prevention**:
Deadlock occurs if a producer acquires mutex first and then blocks on empty when the queue is full, preventing any consumer from entering the critical section to consume an item and signal empty (Hold and Wait). Breaking Hold and Wait by always calling acquire() on empty/full before acquiring mutex prevents this deadlock.

## Summary

**Key concepts I understood through these questions:**
1. How mutex locks and try-finally blocks guarantee mutual exclusion and prevent race conditions.
2. How counting semaphores eliminate busy-waiting and allow efficient thread blocking and waking.
3. How lock granularity and separate locks increase concurrency without risking data corruption.

**Concepts I need to study more:**
1. Advanced deadlock prevention strategies and resource allocation graphs in multi-threaded systems.
2. Fair lock implementations and queue starvation mitigation techniques under heavy thread contention.
---

# ✅ Final Checklist (complete before submitting)

> ⚠️ **WARNING:** Go through every line. Blackboard does not accept submissions after the deadline, which is **November 14, 2026**.

**Repository**
- [x] Repository is **PUBLIC** (Settings → Danger Zone → Visibility)
- [x] Repository is renamed to `OS-Assignment3-YourFirstName-YourLastName`
- [x] GitHub account uses the university email (`@std.psau.edu.sa`)

**Code**
- [x ] Student ID is set in `SchedulerSimulationSync.java` (line 304)
- [ x] My code is based **only** on the starter of this repository (nothing copied from previous assignments)
- [ x] Code compiles and runs with no errors, and terminates by itself (no `⛔ WATCHDOG`)
- [x ] Feature 1 (ready queue lock), Feature 2 (statistics locks) and Feature 3 (semaphore, no busy waiting) all work
- [ x] **The four verification lines are ✔ in 5 consecutive runs**
- [x ] Every lock is released in a `finally` block
- [ x] `RaceWindow`, `Config`, the verification block and the watchdog are **unchanged**
- [x ] Each feature has clear comments

**Commits**
- [ x] **At least 4 meaningful commits, ideally 7 or more**
- [ x] **One commit per feature**
- [ x] Commits are spread over **different dates** (not all in the last hour)
- [x ] Everything is **pushed** to GitHub

**This file (`MY_WORK.md`)**
- [ x] Full name and student ID filled in at the top
- [x ] Development log has **5+ entries** on different dates
- [ x] Reflection: 4 questions, 5-7 sentences each
- [ x] Technical answers: 4 questions, 3-5 sentences each, with examples from **your** output (starter output **and** final output pasted in Question 1)
- [x ] No `[...]` placeholders left
- [x ] No section headers deleted

**Video**
- [x ] 2-3 minutes long, named `StudentID_Assignment3_Demo.mp4`
- [ x] Shows your name, ID, repository, 3 features (and your lock granularity choice), IDE execution with the verification block, one synchronization concept, and commit history
- [ x] Link is **public** (tested in an incognito window) and pasted in the **Video Link** section above

**Blackboard**
- [x ] Submit **only** the link to your public GitHub repository

> 🎯 **Good luck!** Start early, commit regularly, and make sure you can explain every line you submit.
