package subProj_976

import subProj_976.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_976")
    name = "subProj 976"

    buildType(subProj_bt_976_4)
    buildType(subProj_bt_976_5)
    buildType(subProj_bt_976_2)
    buildType(subProj_bt_976_3)
    buildType(subProj_bt_976_0)
    buildType(subProj_bt_976_1)
})
