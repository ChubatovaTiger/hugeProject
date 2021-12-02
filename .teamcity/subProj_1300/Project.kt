package subProj_1300

import subProj_1300.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1300")
    name = "subProj 1300"

    buildType(subProj_bt_1300_5)
    buildType(subProj_bt_1300_4)
    buildType(subProj_bt_1300_1)
    buildType(subProj_bt_1300_0)
    buildType(subProj_bt_1300_3)
    buildType(subProj_bt_1300_2)
})
