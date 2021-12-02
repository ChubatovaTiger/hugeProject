package subProj_1688

import subProj_1688.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1688")
    name = "subProj 1688"

    buildType(subProj_bt_1688_5)
    buildType(subProj_bt_1688_0)
    buildType(subProj_bt_1688_4)
    buildType(subProj_bt_1688_3)
    buildType(subProj_bt_1688_2)
    buildType(subProj_bt_1688_1)
})
