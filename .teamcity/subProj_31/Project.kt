package subProj_31

import subProj_31.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_31")
    name = "subProj 31"

    buildType(subProj_bt_31_0)
    buildType(subProj_bt_31_1)
    buildType(subProj_bt_31_2)
    buildType(subProj_bt_31_3)
    buildType(subProj_bt_31_4)
    buildType(subProj_bt_31_5)
})
