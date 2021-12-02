package subProj_6

import subProj_6.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_6")
    name = "subProj 6"

    buildType(subProj_bt_6_0)
    buildType(subProj_bt_6_1)
    buildType(subProj_bt_6_4)
    buildType(subProj_bt_6_5)
    buildType(subProj_bt_6_2)
    buildType(subProj_bt_6_3)
})
