package subProj_403

import subProj_403.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_403")
    name = "subProj 403"

    buildType(subProj_bt_403_0)
    buildType(subProj_bt_403_1)
    buildType(subProj_bt_403_2)
    buildType(subProj_bt_403_3)
    buildType(subProj_bt_403_4)
    buildType(subProj_bt_403_5)
})
