package subProj_1837

import subProj_1837.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1837")
    name = "subProj 1837"

    buildType(subProj_bt_1837_4)
    buildType(subProj_bt_1837_3)
    buildType(subProj_bt_1837_5)
    buildType(subProj_bt_1837_0)
    buildType(subProj_bt_1837_2)
    buildType(subProj_bt_1837_1)
})
