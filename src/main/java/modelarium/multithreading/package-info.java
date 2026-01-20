/**
 * Internal multithreading and parallel execution support.
 *
 * <p>This package contains the infrastructure used by Modelarium to execute
 * simulations in parallel. It manages thread coordination, task distribution,
 * and synchronization on behalf of the simulation engine.</p>
 *
 * <p>Users are not expected to interact directly with the components in this
 * package or to manage threads themselves. Parallel execution is configured
 * and applied automatically by the engine.</p>
 *
 * <p>When designing models, it is generally preferable for agents to interact
 * primarily with other agents that are updated within the same execution
 * context. Interaction patterns that require frequent coordination or shared
 * mutable state across parallel execution contexts may limit scalability and
 * reduce performance.</p>
 *
 * <p>Structuring models to favour local interactions, coarse-grained updates,
 * and predictable access patterns can help the engine exploit parallelism more
 * effectively and reduce contention.</p>
 *
 * <p>Implementations in this package may evolve as parallel execution
 * strategies and performance characteristics are refined.</p>
 */
package modelarium.multithreading;
