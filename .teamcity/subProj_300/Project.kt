package subProj_300

import subProj_300.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_300")
    name = "subProj 300"

    buildType(subProj_bt_300_3)
    buildType(subProj_bt_300_4)
    buildType(subProj_bt_300_1)
    buildType(subProj_bt_300_2)
    buildType(subProj_bt_300_5)
    buildType(subProj_bt_300_0)
})
