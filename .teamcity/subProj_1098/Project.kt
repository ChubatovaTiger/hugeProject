package subProj_1098

import subProj_1098.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1098")
    name = "subProj 1098"

    buildType(subProj_bt_1098_5)
    buildType(subProj_bt_1098_4)
    buildType(subProj_bt_1098_3)
    buildType(subProj_bt_1098_2)
    buildType(subProj_bt_1098_1)
    buildType(subProj_bt_1098_0)
})
