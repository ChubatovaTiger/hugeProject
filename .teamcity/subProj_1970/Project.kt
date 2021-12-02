package subProj_1970

import subProj_1970.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1970")
    name = "subProj 1970"

    buildType(subProj_bt_1970_5)
    buildType(subProj_bt_1970_1)
    buildType(subProj_bt_1970_2)
    buildType(subProj_bt_1970_3)
    buildType(subProj_bt_1970_4)
    buildType(subProj_bt_1970_0)
})
