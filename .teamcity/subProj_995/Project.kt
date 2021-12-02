package subProj_995

import subProj_995.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_995")
    name = "subProj 995"

    buildType(subProj_bt_995_1)
    buildType(subProj_bt_995_2)
    buildType(subProj_bt_995_0)
    buildType(subProj_bt_995_5)
    buildType(subProj_bt_995_3)
    buildType(subProj_bt_995_4)
})
