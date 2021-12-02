package subProj_1898

import subProj_1898.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1898")
    name = "subProj 1898"

    buildType(subProj_bt_1898_3)
    buildType(subProj_bt_1898_2)
    buildType(subProj_bt_1898_1)
    buildType(subProj_bt_1898_0)
    buildType(subProj_bt_1898_5)
    buildType(subProj_bt_1898_4)
})
