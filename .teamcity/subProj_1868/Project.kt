package subProj_1868

import subProj_1868.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1868")
    name = "subProj 1868"

    buildType(subProj_bt_1868_0)
    buildType(subProj_bt_1868_5)
    buildType(subProj_bt_1868_3)
    buildType(subProj_bt_1868_4)
    buildType(subProj_bt_1868_1)
    buildType(subProj_bt_1868_2)
})
