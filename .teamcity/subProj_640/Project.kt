package subProj_640

import subProj_640.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_640")
    name = "subProj 640"

    buildType(subProj_bt_640_0)
    buildType(subProj_bt_640_1)
    buildType(subProj_bt_640_4)
    buildType(subProj_bt_640_5)
    buildType(subProj_bt_640_2)
    buildType(subProj_bt_640_3)
})
