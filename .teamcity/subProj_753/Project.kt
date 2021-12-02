package subProj_753

import subProj_753.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_753")
    name = "subProj 753"

    buildType(subProj_bt_753_3)
    buildType(subProj_bt_753_4)
    buildType(subProj_bt_753_5)
    buildType(subProj_bt_753_0)
    buildType(subProj_bt_753_1)
    buildType(subProj_bt_753_2)
})
