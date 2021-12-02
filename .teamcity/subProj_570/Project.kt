package subProj_570

import subProj_570.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_570")
    name = "subProj 570"

    buildType(subProj_bt_570_1)
    buildType(subProj_bt_570_0)
    buildType(subProj_bt_570_3)
    buildType(subProj_bt_570_2)
    buildType(subProj_bt_570_5)
    buildType(subProj_bt_570_4)
})
