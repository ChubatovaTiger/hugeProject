package subProj_347

import subProj_347.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_347")
    name = "subProj 347"

    buildType(subProj_bt_347_2)
    buildType(subProj_bt_347_3)
    buildType(subProj_bt_347_4)
    buildType(subProj_bt_347_5)
    buildType(subProj_bt_347_0)
    buildType(subProj_bt_347_1)
})
