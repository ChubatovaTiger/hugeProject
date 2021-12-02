package subProj_954

import subProj_954.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_954")
    name = "subProj 954"

    buildType(subProj_bt_954_5)
    buildType(subProj_bt_954_4)
    buildType(subProj_bt_954_1)
    buildType(subProj_bt_954_0)
    buildType(subProj_bt_954_3)
    buildType(subProj_bt_954_2)
})
