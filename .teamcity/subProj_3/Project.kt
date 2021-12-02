package subProj_3

import subProj_3.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_3")
    name = "subProj 3"

    buildType(subProj_bt_3_0)
    buildType(subProj_bt_3_3)
    buildType(subProj_bt_3_4)
    buildType(subProj_bt_3_1)
    buildType(subProj_bt_3_2)
    buildType(subProj_bt_3_5)
})
