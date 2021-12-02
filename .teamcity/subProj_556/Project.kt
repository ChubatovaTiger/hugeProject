package subProj_556

import subProj_556.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_556")
    name = "subProj 556"

    buildType(subProj_bt_556_0)
    buildType(subProj_bt_556_1)
    buildType(subProj_bt_556_2)
    buildType(subProj_bt_556_3)
    buildType(subProj_bt_556_4)
    buildType(subProj_bt_556_5)
})
