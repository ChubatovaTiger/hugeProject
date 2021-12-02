package subProj_1999

import subProj_1999.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1999")
    name = "subProj 1999"

    buildType(subProj_bt_1999_1)
    buildType(subProj_bt_1999_0)
    buildType(subProj_bt_1999_3)
    buildType(subProj_bt_1999_2)
    buildType(subProj_bt_1999_5)
    buildType(subProj_bt_1999_4)
})
