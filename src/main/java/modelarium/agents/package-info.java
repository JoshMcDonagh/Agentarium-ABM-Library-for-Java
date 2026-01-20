/**
 * Agent abstractions used in Modelarium simulations.
 *
 * <p>This package defines the core concepts for modelling autonomous agents
 * within a simulation. Agents encapsulate state and behaviour, and are
 * typically updated on each simulation step by the engine.</p>
 *
 * <p>Implementations in this package are intended to be extended by users
 * to define domain-specific agent logic, such as decision-making,
 * interactions with the environment, or state transitions over time.</p>
 *
 * <p>The agent lifecycle and update frequency are controlled by the
 * surrounding simulation and scheduling components, rather than by agents
 * themselves.</p>
 */
package modelarium.agents;