package subProj_1596

import subProj_1596.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1596")
    name = "subProj 1596"

    buildType(subProj_bt_1596_0)
    buildType(subProj_bt_1596_5)
    buildType(subProj_bt_1596_2)
    buildType(subProj_bt_1596_1)
    buildType(subProj_bt_1596_4)
    buildType(subProj_bt_1596_3)
})
