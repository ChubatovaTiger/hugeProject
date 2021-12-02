package subProj_1951

import subProj_1951.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1951")
    name = "subProj 1951"

    buildType(subProj_bt_1951_1)
    buildType(subProj_bt_1951_0)
    buildType(subProj_bt_1951_5)
    buildType(subProj_bt_1951_4)
    buildType(subProj_bt_1951_3)
    buildType(subProj_bt_1951_2)
})
