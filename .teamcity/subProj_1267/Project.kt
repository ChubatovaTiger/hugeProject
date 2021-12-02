package subProj_1267

import subProj_1267.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1267")
    name = "subProj 1267"

    buildType(subProj_bt_1267_1)
    buildType(subProj_bt_1267_0)
    buildType(subProj_bt_1267_3)
    buildType(subProj_bt_1267_2)
    buildType(subProj_bt_1267_5)
    buildType(subProj_bt_1267_4)
})
