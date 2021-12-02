package subProj_689

import subProj_689.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_689")
    name = "subProj 689"

    buildType(subProj_bt_689_0)
    buildType(subProj_bt_689_1)
    buildType(subProj_bt_689_2)
    buildType(subProj_bt_689_3)
    buildType(subProj_bt_689_4)
    buildType(subProj_bt_689_5)
})
