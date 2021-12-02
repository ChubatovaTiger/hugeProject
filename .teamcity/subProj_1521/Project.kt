package subProj_1521

import subProj_1521.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1521")
    name = "subProj 1521"

    buildType(subProj_bt_1521_1)
    buildType(subProj_bt_1521_2)
    buildType(subProj_bt_1521_0)
    buildType(subProj_bt_1521_5)
    buildType(subProj_bt_1521_3)
    buildType(subProj_bt_1521_4)
})
