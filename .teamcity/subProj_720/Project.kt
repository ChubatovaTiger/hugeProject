package subProj_720

import subProj_720.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_720")
    name = "subProj 720"

    buildType(subProj_bt_720_2)
    buildType(subProj_bt_720_1)
    buildType(subProj_bt_720_0)
    buildType(subProj_bt_720_5)
    buildType(subProj_bt_720_4)
    buildType(subProj_bt_720_3)
})
