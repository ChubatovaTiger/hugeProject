package subProj_671

import subProj_671.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_671")
    name = "subProj 671"

    buildType(subProj_bt_671_3)
    buildType(subProj_bt_671_2)
    buildType(subProj_bt_671_1)
    buildType(subProj_bt_671_0)
    buildType(subProj_bt_671_5)
    buildType(subProj_bt_671_4)
})
