package subProj_827

import subProj_827.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_827")
    name = "subProj 827"

    buildType(subProj_bt_827_0)
    buildType(subProj_bt_827_2)
    buildType(subProj_bt_827_1)
    buildType(subProj_bt_827_4)
    buildType(subProj_bt_827_3)
    buildType(subProj_bt_827_5)
})
