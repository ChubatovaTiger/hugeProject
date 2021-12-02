package subProj_889

import subProj_889.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_889")
    name = "subProj 889"

    buildType(subProj_bt_889_3)
    buildType(subProj_bt_889_4)
    buildType(subProj_bt_889_5)
    buildType(subProj_bt_889_0)
    buildType(subProj_bt_889_1)
    buildType(subProj_bt_889_2)
})
