package subProj_680

import subProj_680.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_680")
    name = "subProj 680"

    buildType(subProj_bt_680_0)
    buildType(subProj_bt_680_1)
    buildType(subProj_bt_680_2)
    buildType(subProj_bt_680_3)
    buildType(subProj_bt_680_4)
    buildType(subProj_bt_680_5)
})
