package subProj_897

import subProj_897.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_897")
    name = "subProj 897"

    buildType(subProj_bt_897_2)
    buildType(subProj_bt_897_3)
    buildType(subProj_bt_897_4)
    buildType(subProj_bt_897_5)
    buildType(subProj_bt_897_0)
    buildType(subProj_bt_897_1)
})
