package subProj_1790

import subProj_1790.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1790")
    name = "subProj 1790"

    buildType(subProj_bt_1790_0)
    buildType(subProj_bt_1790_2)
    buildType(subProj_bt_1790_1)
    buildType(subProj_bt_1790_4)
    buildType(subProj_bt_1790_3)
    buildType(subProj_bt_1790_5)
})
