package subProj_1192

import subProj_1192.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1192")
    name = "subProj 1192"

    buildType(subProj_bt_1192_0)
    buildType(subProj_bt_1192_5)
    buildType(subProj_bt_1192_2)
    buildType(subProj_bt_1192_1)
    buildType(subProj_bt_1192_4)
    buildType(subProj_bt_1192_3)
})
