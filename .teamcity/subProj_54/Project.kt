package subProj_54

import subProj_54.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_54")
    name = "subProj 54"

    buildType(subProj_bt_54_0)
    buildType(subProj_bt_54_2)
    buildType(subProj_bt_54_1)
    buildType(subProj_bt_54_4)
    buildType(subProj_bt_54_3)
    buildType(subProj_bt_54_5)
})
