package subProj_55

import subProj_55.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_55")
    name = "subProj 55"

    buildType(subProj_bt_55_1)
    buildType(subProj_bt_55_0)
    buildType(subProj_bt_55_3)
    buildType(subProj_bt_55_2)
    buildType(subProj_bt_55_5)
    buildType(subProj_bt_55_4)
})
