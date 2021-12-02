package subProj_1686

import subProj_1686.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1686")
    name = "subProj 1686"

    buildType(subProj_bt_1686_2)
    buildType(subProj_bt_1686_1)
    buildType(subProj_bt_1686_0)
    buildType(subProj_bt_1686_5)
    buildType(subProj_bt_1686_4)
    buildType(subProj_bt_1686_3)
})
