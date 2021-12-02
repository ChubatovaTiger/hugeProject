package subProj_164

import subProj_164.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_164")
    name = "subProj 164"

    buildType(subProj_bt_164_0)
    buildType(subProj_bt_164_1)
    buildType(subProj_bt_164_2)
    buildType(subProj_bt_164_3)
    buildType(subProj_bt_164_4)
    buildType(subProj_bt_164_5)
})
