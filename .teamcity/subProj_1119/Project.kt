package subProj_1119

import subProj_1119.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1119")
    name = "subProj 1119"

    buildType(subProj_bt_1119_1)
    buildType(subProj_bt_1119_0)
    buildType(subProj_bt_1119_3)
    buildType(subProj_bt_1119_2)
    buildType(subProj_bt_1119_5)
    buildType(subProj_bt_1119_4)
})
