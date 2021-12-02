package subProj_546

import subProj_546.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_546")
    name = "subProj 546"

    buildType(subProj_bt_546_0)
    buildType(subProj_bt_546_1)
    buildType(subProj_bt_546_2)
    buildType(subProj_bt_546_3)
    buildType(subProj_bt_546_4)
    buildType(subProj_bt_546_5)
})
