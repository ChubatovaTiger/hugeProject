package subProj_776

import subProj_776.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_776")
    name = "subProj 776"

    buildType(subProj_bt_776_3)
    buildType(subProj_bt_776_2)
    buildType(subProj_bt_776_5)
    buildType(subProj_bt_776_4)
    buildType(subProj_bt_776_1)
    buildType(subProj_bt_776_0)
})
