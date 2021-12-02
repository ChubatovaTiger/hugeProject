package subProj_1281

import subProj_1281.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1281")
    name = "subProj 1281"

    buildType(subProj_bt_1281_2)
    buildType(subProj_bt_1281_3)
    buildType(subProj_bt_1281_0)
    buildType(subProj_bt_1281_1)
    buildType(subProj_bt_1281_4)
    buildType(subProj_bt_1281_5)
})
