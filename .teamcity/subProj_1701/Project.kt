package subProj_1701

import subProj_1701.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1701")
    name = "subProj 1701"

    buildType(subProj_bt_1701_0)
    buildType(subProj_bt_1701_2)
    buildType(subProj_bt_1701_1)
    buildType(subProj_bt_1701_4)
    buildType(subProj_bt_1701_3)
    buildType(subProj_bt_1701_5)
})
