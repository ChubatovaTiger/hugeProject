package subProj_119

import subProj_119.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_119")
    name = "subProj 119"

    buildType(subProj_bt_119_1)
    buildType(subProj_bt_119_2)
    buildType(subProj_bt_119_0)
    buildType(subProj_bt_119_5)
    buildType(subProj_bt_119_3)
    buildType(subProj_bt_119_4)
})
