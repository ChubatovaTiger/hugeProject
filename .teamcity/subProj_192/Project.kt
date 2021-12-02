package subProj_192

import subProj_192.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_192")
    name = "subProj 192"

    buildType(subProj_bt_192_4)
    buildType(subProj_bt_192_5)
    buildType(subProj_bt_192_2)
    buildType(subProj_bt_192_3)
    buildType(subProj_bt_192_0)
    buildType(subProj_bt_192_1)
})
