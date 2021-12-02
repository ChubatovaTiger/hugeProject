package subProj_902

import subProj_902.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_902")
    name = "subProj 902"

    buildType(subProj_bt_902_0)
    buildType(subProj_bt_902_5)
    buildType(subProj_bt_902_3)
    buildType(subProj_bt_902_4)
    buildType(subProj_bt_902_1)
    buildType(subProj_bt_902_2)
})
