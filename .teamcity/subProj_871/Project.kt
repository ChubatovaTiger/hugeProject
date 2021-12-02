package subProj_871

import subProj_871.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_871")
    name = "subProj 871"

    buildType(subProj_bt_871_1)
    buildType(subProj_bt_871_0)
    buildType(subProj_bt_871_5)
    buildType(subProj_bt_871_4)
    buildType(subProj_bt_871_3)
    buildType(subProj_bt_871_2)
})
