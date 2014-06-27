package com.bios21.frankencraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.bios21.frankencraft.FrankencraftMain;
import com.bios21.frankencraft.utils.FcWorldWrapper;

public class MultiBlockGiantPoil extends BlockContainer {

	public MultiBlockGiantPoil() {
		super(Material.ground);
		this.setBlockName("giantPoil");
		this.setBlockTextureName(FrankencraftMain.MODID + ":" + "giantPoil");
		this.setCreativeTab(FrankencraftMain.creativeTabsFrankencraft);
		
	}
	
	
	public boolean isMultiBlockStructure(FcWorldWrapper fcWorldWrapper, int x, int y, int z) {
		if (checkNorth(fcWorldWrapper, x, y, z))/* North */
			return true;
		if (checkEast(fcWorldWrapper, x, y, z))/* East */
			return true;
		if (checkSouth(fcWorldWrapper, x, y, z))/* South */
			return true;
		if (checkWest(fcWorldWrapper, x, y, z))/* West */
			return true;
		return false;
	}

	private static boolean checkNorth(FcWorldWrapper fcWorldWrapper, int x, int y, int z) {
		if (fcWorldWrapper.getBlockId(x + -1, y + -1, z + 0) == 165) {
			if (fcWorldWrapper.getBlockId(x + -1, y + -1, z + -1) == 165) {
				if (fcWorldWrapper.getBlockId(x + -1, y + -1, z + -2) == 165) {
					if (fcWorldWrapper.getBlockId(x + -1, y + 0, z + 0) == 165) {
						if (fcWorldWrapper.getBlockId(x + -1, y + 0, z + -1) == 165) {
							if (fcWorldWrapper.getBlockId(x + -1, y + 0, z + -2) == 165) {
								if (fcWorldWrapper.getBlockId(x + -1, y + 1, z + 0) == 165) {
									if (fcWorldWrapper.getBlockId(x + -1, y + 1, z + -1) == 165) {
										if (fcWorldWrapper.getBlockId(x + -1, y + 1, z
												+ -2) == 165) {
											if (fcWorldWrapper.getBlockId(x + 0, y + -1,
													z + 0) == 165) {
												if (fcWorldWrapper.getBlockId(x + 0, y
														+ -1, z + -1) == 165) {
													if (fcWorldWrapper.getBlockId(x + 0,
															y + -1, z + -2) == 165) {
														if (fcWorldWrapper.getBlockId(
																x + 0, y + 0, z
																		+ -1) == 0) {
															if (fcWorldWrapper
																	.getBlockId(
																			x + 0,
																			y + 0,
																			z
																					+ -2) == 165) {
																if (fcWorldWrapper
																		.getBlockId(
																				x + 0,
																				y + 1,
																				z + 0) == 165) {
																	if (fcWorldWrapper
																			.getBlockId(
																					x + 0,
																					y + 1,
																					z
																							+ -1) == 165) {
																		if (fcWorldWrapper
																				.getBlockId(
																						x + 0,
																						y + 1,
																						z
																								+ -2) == 165) {
																			if (fcWorldWrapper
																					.getBlockId(
																							x + 1,
																							y
																									+ -1,
																							z + 0) == 165) {
																				if (fcWorldWrapper
																						.getBlockId(
																								x + 1,
																								y
																										+ -1,
																								z
																										+ -1) == 165) {
																					if (fcWorldWrapper
																							.getBlockId(
																									x + 1,
																									y
																											+ -1,
																									z
																											+ -2) == 165) {
																						if (fcWorldWrapper
																								.getBlockId(
																										x + 1,
																										y + 0,
																										z + 0) == 165) {
																							if (fcWorldWrapper
																									.getBlockId(
																											x + 1,
																											y + 0,
																											z
																													+ -1) == 165) {
																								if (fcWorldWrapper
																										.getBlockId(
																												x + 1,
																												y + 0,
																												z
																														+ -2) == 165) {
																									if (fcWorldWrapper
																											.getBlockId(
																													x + 1,
																													y + 1,
																													z + 0) == 165) {
																										if (fcWorldWrapper
																												.getBlockId(
																														x + 1,
																														y + 1,
																														z
																																+ -1) == 165) {
																											if (fcWorldWrapper
																													.getBlockId(
																															x + 1,
																															y + 1,
																															z
																																	+ -2) == 165) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkEast(FcWorldWrapper fcWorldWrapper, int x, int y, int z) {
		if (fcWorldWrapper.getBlockId(x + 0, y + -1, z + -1) == 165) {
			if (fcWorldWrapper.getBlockId(x + 1, y + -1, z + -1) == 165) {
				if (fcWorldWrapper.getBlockId(x + 2, y + -1, z + -1) == 165) {
					if (fcWorldWrapper.getBlockId(x + 0, y + 0, z + -1) == 165) {
						if (fcWorldWrapper.getBlockId(x + 1, y + 0, z + -1) == 165) {
							if (fcWorldWrapper.getBlockId(x + 2, y + 0, z + -1) == 165) {
								if (fcWorldWrapper.getBlockId(x + 0, y + 1, z + -1) == 165) {
									if (fcWorldWrapper.getBlockId(x + 1, y + 1, z + -1) == 165) {
										if (fcWorldWrapper.getBlockId(x + 2, y + 1, z
												+ -1) == 165) {
											if (fcWorldWrapper.getBlockId(x + 0, y + -1,
													z + 0) == 165) {
												if (fcWorldWrapper.getBlockId(x + 1, y
														+ -1, z + 0) == 165) {
													if (fcWorldWrapper.getBlockId(x + 2,
															y + -1, z + 0) == 165) {
														if (fcWorldWrapper.getBlockId(
																x + 1, y + 0,
																z + 0) == 0) {
															if (fcWorldWrapper
																	.getBlockId(
																			x + 2,
																			y + 0,
																			z + 0) == 165) {
																if (fcWorldWrapper
																		.getBlockId(
																				x + 0,
																				y + 1,
																				z + 0) == 165) {
																	if (fcWorldWrapper
																			.getBlockId(
																					x + 1,
																					y + 1,
																					z + 0) == 165) {
																		if (fcWorldWrapper
																				.getBlockId(
																						x + 2,
																						y + 1,
																						z + 0) == 165) {
																			if (fcWorldWrapper
																					.getBlockId(
																							x + 0,
																							y
																									+ -1,
																							z + 1) == 165) {
																				if (fcWorldWrapper
																						.getBlockId(
																								x + 1,
																								y
																										+ -1,
																								z + 1) == 165) {
																					if (fcWorldWrapper
																							.getBlockId(
																									x + 2,
																									y
																											+ -1,
																									z + 1) == 165) {
																						if (fcWorldWrapper
																								.getBlockId(
																										x + 0,
																										y + 0,
																										z + 1) == 165) {
																							if (fcWorldWrapper
																									.getBlockId(
																											x + 1,
																											y + 0,
																											z + 1) == 165) {
																								if (fcWorldWrapper
																										.getBlockId(
																												x + 2,
																												y + 0,
																												z + 1) == 165) {
																									if (fcWorldWrapper
																											.getBlockId(
																													x + 0,
																													y + 1,
																													z + 1) == 165) {
																										if (fcWorldWrapper
																												.getBlockId(
																														x + 1,
																														y + 1,
																														z + 1) == 165) {
																											if (fcWorldWrapper
																													.getBlockId(
																															x + 2,
																															y + 1,
																															z + 1) == 165) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkSouth(FcWorldWrapper fcWorldWrapper, int x, int y, int z) {
		if (fcWorldWrapper.getBlockId(x + 1, y + -1, z + 0) == 165) {
			if (fcWorldWrapper.getBlockId(x + 1, y + -1, z + 1) == 165) {
				if (fcWorldWrapper.getBlockId(x + 1, y + -1, z + 2) == 165) {
					if (fcWorldWrapper.getBlockId(x + 1, y + 0, z + 0) == 165) {
						if (fcWorldWrapper.getBlockId(x + 1, y + 0, z + 1) == 165) {
							if (fcWorldWrapper.getBlockId(x + 1, y + 0, z + 2) == 165) {
								if (fcWorldWrapper.getBlockId(x + 1, y + 1, z + 0) == 165) {
									if (fcWorldWrapper.getBlockId(x + 1, y + 1, z + 1) == 165) {
										if (fcWorldWrapper.getBlockId(x + 1, y + 1,
												z + 2) == 165) {
											if (fcWorldWrapper.getBlockId(x + 0, y + -1,
													z + 0) == 165) {
												if (fcWorldWrapper.getBlockId(x + 0, y
														+ -1, z + 1) == 165) {
													if (fcWorldWrapper.getBlockId(x + 0,
															y + -1, z + 2) == 165) {
														if (fcWorldWrapper.getBlockId(
																x + 0, y + 0,
																z + 1) == 0) {
															if (fcWorldWrapper
																	.getBlockId(
																			x + 0,
																			y + 0,
																			z + 2) == 165) {
																if (fcWorldWrapper
																		.getBlockId(
																				x + 0,
																				y + 1,
																				z + 0) == 165) {
																	if (fcWorldWrapper
																			.getBlockId(
																					x + 0,
																					y + 1,
																					z + 1) == 165) {
																		if (fcWorldWrapper
																				.getBlockId(
																						x + 0,
																						y + 1,
																						z + 2) == 165) {
																			if (fcWorldWrapper
																					.getBlockId(
																							x
																									+ -1,
																							y
																									+ -1,
																							z + 0) == 165) {
																				if (fcWorldWrapper
																						.getBlockId(
																								x
																										+ -1,
																								y
																										+ -1,
																								z + 1) == 165) {
																					if (fcWorldWrapper
																							.getBlockId(
																									x
																											+ -1,
																									y
																											+ -1,
																									z + 2) == 165) {
																						if (fcWorldWrapper
																								.getBlockId(
																										x
																												+ -1,
																										y + 0,
																										z + 0) == 165) {
																							if (fcWorldWrapper
																									.getBlockId(
																											x
																													+ -1,
																											y + 0,
																											z + 1) == 165) {
																								if (fcWorldWrapper
																										.getBlockId(
																												x
																														+ -1,
																												y + 0,
																												z + 2) == 165) {
																									if (fcWorldWrapper
																											.getBlockId(
																													x
																															+ -1,
																													y + 1,
																													z + 0) == 165) {
																										if (fcWorldWrapper
																												.getBlockId(
																														x
																																+ -1,
																														y + 1,
																														z + 1) == 165) {
																											if (fcWorldWrapper
																													.getBlockId(
																															x
																																	+ -1,
																															y + 1,
																															z + 2) == 165) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	private static boolean checkWest(FcWorldWrapper fcWorldWrapper, int x, int y, int z) {
		if (fcWorldWrapper.getBlockId(x + 0, y + -1, z + 1) == 165) {
			if (fcWorldWrapper.getBlockId(x + -1, y + -1, z + 1) == 165) {
				if (fcWorldWrapper.getBlockId(x + -2, y + -1, z + 1) == 165) {
					if (fcWorldWrapper.getBlockId(x + 0, y + 0, z + 1) == 165) {
						if (fcWorldWrapper.getBlockId(x + -1, y + 0, z + 1) == 165) {
							if (fcWorldWrapper.getBlockId(x + -2, y + 0, z + 1) == 165) {
								if (fcWorldWrapper.getBlockId(x + 0, y + 1, z + 1) == 165) {
									if (fcWorldWrapper.getBlockId(x + -1, y + 1, z + 1) == 165) {
										if (fcWorldWrapper.getBlockId(x + -2, y + 1,
												z + 1) == 165) {
											if (fcWorldWrapper.getBlockId(x + 0, y + -1,
													z + 0) == 165) {
												if (fcWorldWrapper.getBlockId(x + -1, y
														+ -1, z + 0) == 165) {
													if (fcWorldWrapper.getBlockId(
															x + -2, y + -1,
															z + 0) == 165) {
														if (fcWorldWrapper.getBlockId(x
																+ -1, y + 0,
																z + 0) == 0) {
															if (fcWorldWrapper
																	.getBlockId(
																			x
																					+ -2,
																			y + 0,
																			z + 0) == 165) {
																if (fcWorldWrapper
																		.getBlockId(
																				x + 0,
																				y + 1,
																				z + 0) == 165) {
																	if (fcWorldWrapper
																			.getBlockId(
																					x
																							+ -1,
																					y + 1,
																					z + 0) == 165) {
																		if (fcWorldWrapper
																				.getBlockId(
																						x
																								+ -2,
																						y + 1,
																						z + 0) == 165) {
																			if (fcWorldWrapper
																					.getBlockId(
																							x + 0,
																							y
																									+ -1,
																							z
																									+ -1) == 165) {
																				if (fcWorldWrapper
																						.getBlockId(
																								x
																										+ -1,
																								y
																										+ -1,
																								z
																										+ -1) == 165) {
																					if (fcWorldWrapper
																							.getBlockId(
																									x
																											+ -2,
																									y
																											+ -1,
																									z
																											+ -1) == 165) {
																						if (fcWorldWrapper
																								.getBlockId(
																										x + 0,
																										y + 0,
																										z
																												+ -1) == 165) {
																							if (fcWorldWrapper
																									.getBlockId(
																											x
																													+ -1,
																											y + 0,
																											z
																													+ -1) == 165) {
																								if (fcWorldWrapper
																										.getBlockId(
																												x
																														+ -2,
																												y + 0,
																												z
																														+ -1) == 165) {
																									if (fcWorldWrapper
																											.getBlockId(
																													x + 0,
																													y + 1,
																													z
																															+ -1) == 165) {
																										if (fcWorldWrapper
																												.getBlockId(
																														x
																																+ -1,
																														y + 1,
																														z
																																+ -1) == 165) {
																											if (fcWorldWrapper
																													.getBlockId(
																															x
																																	+ -2,
																															y + 1,
																															z
																																	+ -1) == 165) {
																												return true;
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

}
