package subProj_1403

import subProj_1403.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1403")
    name = "subProj 1403"

    buildType(subProj_bt_1403_5)
    buildType(subProj_bt_1403_4)
    buildType(subProj_bt_1403_3)
    buildType(subProj_bt_1403_2)
    buildType(subProj_bt_1403_1)
    buildType(subProj_bt_1403_0)
})
