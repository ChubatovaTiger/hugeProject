package subProj_1556

import subProj_1556.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1556")
    name = "subProj 1556"

    buildType(subProj_bt_1556_5)
    buildType(subProj_bt_1556_0)
    buildType(subProj_bt_1556_4)
    buildType(subProj_bt_1556_3)
    buildType(subProj_bt_1556_2)
    buildType(subProj_bt_1556_1)
})
