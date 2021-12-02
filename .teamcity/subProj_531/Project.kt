package subProj_531

import subProj_531.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_531")
    name = "subProj 531"

    buildType(subProj_bt_531_0)
    buildType(subProj_bt_531_5)
    buildType(subProj_bt_531_4)
    buildType(subProj_bt_531_3)
    buildType(subProj_bt_531_2)
    buildType(subProj_bt_531_1)
})
