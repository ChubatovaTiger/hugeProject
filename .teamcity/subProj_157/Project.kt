package subProj_157

import subProj_157.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_157")
    name = "subProj 157"

    buildType(subProj_bt_157_0)
    buildType(subProj_bt_157_1)
    buildType(subProj_bt_157_2)
    buildType(subProj_bt_157_3)
    buildType(subProj_bt_157_4)
    buildType(subProj_bt_157_5)
})
